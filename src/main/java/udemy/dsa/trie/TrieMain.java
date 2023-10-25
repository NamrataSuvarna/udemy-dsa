package udemy.dsa.trie;

public class TrieMain {

	public static void main(String[] args) {
		// Time & Space Complexity - O(1)
		Trie trie = new Trie();

		// Time & Space Complexity - O(M) -> M = length of word
		trie.insert("API");
		trie.insert("APIS");

		// Time & Space Complexity - O(M) -> M = length of word
		trie.search("API");
		trie.search("AP");
		trie.search("APS");

		trie.delete("API");
		trie.search("API");
		trie.delete("AP");
		trie.search("AP");
	}

}