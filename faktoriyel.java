

public class faktoriyel {
	 public static void main(String args[]){
		    int sayi= Integer.parseInt(args[0]);
		    int faktoriyel=1;
		    int i=1;
		   while(i<=sayi) {
		    	faktoriyel*=i;
		    	i++;
		    }
		    System.out.println(faktoriyel);
	    }
}

