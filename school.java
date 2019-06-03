class results{
	private	int phy,che,mat;
	public void showresults(){
	int total;
	if(phy== -1 || che == -1 || mat == -1){
		System.out.println("No results");		
	}
	else{
		total=phy + che + mat;
		System.out.println("Result is"+ total);
		}
	}

	public void physics(int p){
		if (p>=0 && p<=150){
			phy=p;
		}
    	else{
    		System.out.println("Invalid physics mark");
    	}
    }
	public void chemistry(int c){
		if (c>=0 && c<=150){
			che=c;
		}
    	else{
    		System.out.println("Invalid chemistry mark");
    	}
    }
	public void maths(int m){
		if (m>=0 && m<=150){
			mat=m;
		}
    	else{
    		System.out.println("Invalid maths mark");
    	}
	}
}
class school{
		public static void main(String xyz[]){
			results peter,james;
			
			peter=new results();
			james=new results();
			
			peter.physics(165);
			james.physics(165);
			peter.chemistry(160);
			james.chemistry(151);
			peter.maths(155);
			james.maths(155);
			
			peter.showresults();
			james.showresults();	
		}
	
	}

