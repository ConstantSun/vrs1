public class DictionaryCommandLine {
	public  static void main (String[] args) {
		DictionaryCommandline dictionary_command_line = new DictionaryCommandline();
		dictionary_command_line.dictionary_management.insertFromCommandline();
		dictionary_command_line.showAllWords();
	}
}