package udemy.dsa.trie;

public class Trie {

	public TrieNode root;

	public Trie() {
		root = new TrieNode();
	}

	public void delete(String word) {
		if (search(word)) {
			delete(root, word, 0);
		}
	}

	private boolean delete(TrieNode parentNode, String word, int index) {
		Character character = word.charAt(index);
		TrieNode currentNode = parentNode.children.get(character);
		boolean canThisNodeBeDeleted;
		if (currentNode.children.size() > 1) {
			delete(currentNode, word, index++);
			return false;
		}
		if (index == word.length() - 1) {
			if (currentNode.children.size() >= 1) {
				currentNode.endOfString = false;
				return false;
			} else {
				parentNode.children.remove(character);
				return true;
			}
		}
		if (currentNode.endOfString == true) {
			delete(currentNode, word, index++);
			return false;
		}
		canThisNodeBeDeleted = delete(currentNode, word, index++);
		if (canThisNodeBeDeleted == true) {
			parentNode.children.remove(character);
			return true;
		} else {
			return false;
		}
	}

	public void insert(String word) {
		TrieNode currentNode = root;
		for (int i = 0; i < word.length(); i++) {
			Character character = word.charAt(i);
			TrieNode trieNode = currentNode.children.get(character);
			if (trieNode == null) {
				trieNode = new TrieNode();
				currentNode.children.put(character, trieNode);
			}
			currentNode = trieNode;
		}
		currentNode.endOfString = true;
		System.out.println("Successfully inserted " + word + " into trie.");
	}

	public boolean search(String word) {
		TrieNode currentNode = root;
		for (int i = 0; i < word.length(); i++) {
			Character character = word.charAt(i);
			TrieNode trieNode = currentNode.children.get(character);
			if (trieNode == null) {
				System.out.println(word + " does not exist in trie.");
				return false;
			}
			currentNode = trieNode;
		}
		if (!currentNode.endOfString) {
			System.out.println(word + " itself does not exist and is a prefix of another word in the trie.");
			return false;
		}
		System.out.println(word + " exists in trie.");
		return true;
	}

}