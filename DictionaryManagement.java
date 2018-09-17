import java.util.*;
import java.io.*;
class DictionaryManagement {
	public Dictionary dictionary = new Dictionary();	
	public void insertFromCommandline() {
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao ban phim so luong tu vung :") ;
		int num_of_vocab, i = dictionary.size ;
		num_of_vocab = in.nextInt();
		String s = in.nextLine();
		while (num_of_vocab>0){
			
			dictionary.words[i] = new Word();
			dictionary.words[i].word_target = in.nextLine();
			dictionary.words[i].word_explain = in.nextLine();

			num_of_vocab--;
			i++;
		}
		dictionary.size = i;
	}
}