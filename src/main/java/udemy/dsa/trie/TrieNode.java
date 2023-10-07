package udemy.dsa.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {

	public Map<Character, TrieNode> children;

	public boolean endOfString;

	public TrieNode() {
		children = new HashMap<>();
		endOfString = false;
	}

}