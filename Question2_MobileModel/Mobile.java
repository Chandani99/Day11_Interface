package Question2_MobileModel;

import java.util.Scanner;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
	public void searchOutdatedModel(String name, String ... model) {
		for (String mod:model ) {
			int flag=0;
			for(int i=0; i<outdatedModels.length; i++) {
				if(mod.equalsIgnoreCase(outdatedModels[i])) {
					flag++;
				}
			}
			if(flag==0) {
				System.out.println(mod+"_OUTDATED");
			}
		}
	}
	
	public static void main(String arg[]) {
		Mobile mob=new Mobile();
		Scanner sc=new Scanner(System.in);
		
		mob.searchOutdatedModel("Nokia", "note5","note10","note11");
		
		mob.searchOutdatedModel("Nokia", "note12");
	}
}
