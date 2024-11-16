package com.client;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;




import com.service.service;

public class IPLClient {
	public static void main(String[] args) throws IOException {
		
	
	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

	int choice;

	do {
		System.out.println("All Teams Of IPL-2024");
		System.out.println("------------------------");
		service.displayTeam();// display all teams of IPL-2024
		System.out.println();
		service.getTeamName();

		System.out.println("Enter Player name of above team that you want to see all details");
		String pname = bf.readLine();

		service.getPlayer(pname);
		System.out.println("----------------------------------------------------------------------------------");

		System.out.println();
		System.out.println("Enter choice");
		System.out.println("1.see all teams again");
		System.out.println("2.exit");
		do {
			choice = Integer.parseInt(bf.readLine());
			switch (choice) {
			case 1: {

				break;
			}
			case 2: {
				
						System.out.println("Thank You For Visit.......!");
				break;

			}
			default:
				System.out.println("Please Enter Valid Choice");

			}
		} while (choice <= 0 || choice > 2);

	} while (choice == 1);

}


}


	


