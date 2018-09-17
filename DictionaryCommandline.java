class DictionaryCommandline {
	public DictionaryManagement dictionary_management = new DictionaryManagement();
	public void showAllWords() {
		System.out.println("No    | English          | Vietnamese ");
		for(int i = 0;i<dictionary_management.dictionary.size;i++) {
			System.out.println(i+1 + "    | "+ dictionary_management.dictionary.words[i].word_target+ 
				"     | "+ dictionary_management.dictionary.words[i].word_explain );
		}
	}
}