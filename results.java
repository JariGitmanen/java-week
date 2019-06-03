class results{
	public static void main(String xyz[]){
		int phy,che,mat,total;
		float per;
		phy=50;
		che=100;
		mat=100;
		total=phy+che+mat;
		per=total*100/450;
		System.out.println("Total marks: "+total);
		System.out.println("Percentage total: "+per);

	if(per>=60){
		System.out.println("You have passed the exam");
		}
	if(per<60){
		System.out.println("You have failed the exam");
		}
	}
}