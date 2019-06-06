class wordcount{
	public void wordcount1(String msg){
		int word=1;
		int i=0;
		while (i<msg.length()){
			if(msg.substring(i,i+1).equals(" ")){
				word++;
			}
		i++;
		}
	System.out.println(word);
	}
}

class callword{
	public static void main (String xyz[]){
	wordcount x = new wordcount();
	x.wordcount1("Hello my friends");
	}
}