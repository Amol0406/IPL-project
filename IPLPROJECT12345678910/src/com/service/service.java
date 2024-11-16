package com.service;

import java.util.Scanner;
import com.dao.*;
import com.entity.player;

public class service {
	static Scanner sc= new Scanner(System.in);
	static char c;
	static int choice;
	
	
	
	//displayTeam display all teams.
		public static void displayTeam() {
			int a = 1;
			String tm[] = teamdata.getteams();
			for (String iterable_element : tm) {

				String teamname = iterable_element;
				System.out.printf(" %d  %s    \n", a, teamname);
				a++;
				System.out.println("------------");
			}
		}
		public static void getTeamName() {

			System.out.println("Enter Choice");

			do {

				choice = sc.nextInt();
				switch (choice) {
				case 1: {

					service.csk();
					break;

				}
				case 2: {

					service.dc();
					break;
				}
				case 3: {

					service.gt();
					break;
				}
				case 4: {

					service.kkr();
					break;
				}
				case 5: {

					service.lsg();
					break;
				}
				case 6: {

					service.mi();
					break;
				}
				case 7: {

					service.pk();
					break;
				}
				case 8: {

					service.rr();
					break;
				}
				case 9: {

					service.rcb();
					break;
				}
				case 10: {

					service.srh();
					break;
				}
				default:
					System.out.println("Please Enter Valid choice");
				}
			} while (choice > 10);

		}

		public static void getPlayer(String playername) {

			player[] pldata = teamdata.playersData();

			for (player player : pldata) {

				if (player.getName().equalsIgnoreCase(playername)) {

					System.out.println(player);
				}

			}

		}

		public static player[] csk() {
			System.out.println("CSK SQUAD");
			System.out.println("-------------------------------------------------------");

			player[] pldata = teamdata.playersData();

			for (player player : pldata) {

				if (player.getTeamname().equalsIgnoreCase("csk")) {

					System.out.println(player.getName());// print squad of CSK Team

				}

			}
			System.out.println("-------------------------------------------------------");

			return pldata;

		}

		public static void dc() {
			System.out.println("DC Squad");
			// String teamName =

			player[] dc = teamdata.playersData();
			for (player player : dc) {

				if (player.getTeamname().equalsIgnoreCase("dc")) {

					System.out.println(player.getName());
				}

			}

		}

		public static void gt() {
			System.out.println();
			System.out.println("GT Squad");
			System.out.println("-------------------");

			player[] gt = teamdata.playersData();
			for (player player : gt) {

				if (player.getTeamname().equalsIgnoreCase("gt")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void kkr() {
			System.out.println("KKR team");

			player[] kkr = teamdata.playersData();
			for (player player : kkr) {

				if (player.getTeamname().equalsIgnoreCase("kkr")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void lsg() {
			System.out.println("LSG team");

			player[] kkr = teamdata.playersData();
			for (player player : kkr) {

				if (player.getTeamname().equalsIgnoreCase("kkr")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void mi() {
			System.out.println("MI team");

			player[] mi = teamdata.playersData();
			for (player player : mi) {

				if (player.getTeamname().equalsIgnoreCase("mi")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void pk() {
			System.out.println("PK team");

			player[] pk = teamdata.playersData();
			for (player player : pk) {

				if (player.getTeamname().equalsIgnoreCase("pk")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void rr() {
			System.out.println("RR team");
			player[] rr = teamdata.playersData();
			for (player player : rr) {

				if (player.getTeamname().equalsIgnoreCase("rr")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void rcb() {
			System.out.println("RCB team");

			player[] rcb = teamdata.playersData();
			for (player player : rcb) {

				if (player.getTeamname().equalsIgnoreCase("rcb")) {

					System.out.println(player.getName());
				}

			}
		}

		public static void srh() {
			System.out.println("SHR team");

			player[] shr = teamdata.playersData();
			for (player player : shr) {

				if (player.getTeamname().equalsIgnoreCase("srh")) {

					System.out.println(player.getName());
				}

			}
		}

	}



			
	
	
	


