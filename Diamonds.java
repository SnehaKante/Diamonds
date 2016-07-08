import java.util.*;
import java.lang.*;
import java.io.*;


class Diamonds{

    	int i = 0;
	int faceupcard ;
	int usedcpucards[] = new int[12];
	Diamonds(int faceupcard){
	   this.faceupcard = faceupcard;
	}
	public int cpucard(int faceupcard){
	    
	   int k = 0;
	   if(faceupcard >= 0 && faceupcard <= 3)
	       k = random_num_gen(1,3);
	   else if(faceupcard >= 4 && faceupcard <= 6)
	       k = random_num_gen(4,6);
	  else if(faceupcard >= 7 && faceupcard <= 9)
	       k = random_num_gen(7,9);
	  else if(faceupcard >= 10 && faceupcard <= 12)
	       k = random_num_gen(10,12);
	  return k;
	
	}
	public int random_num_gen(int min, int max){
		Random r = new Random();
		int randomnum = 25;
		int k =  min + r.nextInt(max - min + 1);
		if(isnotaRepeatedCard(k))
			randomnum = k;
		else
			random_num_gen(min, max);
		usedcpucards[i] = randomnum;
		i++;
		return randomnum;
		       
	}
	public boolean isnotaRepeatedCard(int randomnum) {
	           boolean k = false;
                   for(int j = 0; j < usedcpucards.length; j++){
                        if(usedcpucards[j]==randomnum)
                            k =  false;
                            
                        else
                            k = true;
                    }
                    return k;
       	}

	
}
