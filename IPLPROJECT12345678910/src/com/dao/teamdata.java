package com.dao;
import com.entity.player;

public class teamdata {
		public static String[] getteams() {
			String db[]= {"csk","Dc","Gt","KKR","LSG","mi","pk","RR","RCB","SRH"};
			return db;
		}
		
			public static player[] playersData() {
		//	Attributes:-String name; int jrcyNo; String teamName; int runs; int wickets; int matches;
				player p1 = new player("MS Dhoni", 7, "CSK", 5045, 0, 234);
				player p2 = new player("Ruturaj Gaikwad", 3, "CSK", 2883, 3, 102);
				player p3 = new player("Deepak Chahar", 9, "CSK", 914, 109, 90);
				player p4 = new player("Mukesh Choudhari", 63, "CSK", 190, 25, 18);
				player p5 = new player("Ravindra Jadeja", 8, "CSK", 2827, 165, 192);
				player p6 = new player("Shivam Dube", 4, "CSK", 1034, 30, 58);
				player p7 = new player("Rishabh Pant", 65, "DC", 4534, 2, 127);
				player p8 = new player("Davi Warner", 6, "DC", 5434, 12, 127);
				player p9 = new player("Axar Patel", 2, "DC", 3456, 65, 234);
				player p10 = new player("Lalit Yadav", 13, "DC", 6434, 3, 487);
				player p11 = new player("Pravin Dubey", 20, "DC", 6434, 3, 487);
				player p12 = new player("Kuldeep Yadav", 21, "DC", 6434, 3, 487);

				player p13 = new player("Shubham Gill", 7, "GT", 3216, 0, 103);
				player p14 = new player("David Miller", 7, "GT", 2924, 0, 130);
				player p15 = new player("Abhinav Manohar", 7, "GT", 520, 11, 21);
				player p16 = new player("B.Sai Sudharsan", 7, "GT", 1034, 13, 25);
				player p17 = new player("Mohammad Shami", 7, "GT", 69, 79, 110);
				player p18 = new player("Umesh Yadav", 7, "GT", 208, 144, 148);

				// runs>1000--matter | wicket>50--Boller | runs>1000&& wicket>20
				player p19 = new player("Shreyas Iyer (C)", 41, "KKR", 2989, 0, 101);// bat
				player p21 = new player("Nitish Rana", 27, "KKR", 2181, 7, 98);// bat
				player p22 = new player("Sunil Narine", 74, "KKR", 1025, 153, 148);// bal;
				player p23 = new player("Varun Chakravarthy", 29, "KKR", 23, 67, 53);// bal
				player p24 = new player("Venkatesh Iyer", 25, "KKR", 823, 3, 35);// all
				player p25 = new player("Andre Russell	", 12, "KKR", 2200, 96, 112);// all

				player p26 = new player("KL Rahul (C & WK)", 1, "LSG", 4000, 0, 117);// bat
				player p27 = new player("Nicholas Pooran", 29, "LSG", 1500, 0, 47);// bat
				player p28 = new player("Ravi Bishnoi", 56, "LSG", 50, 51, 15);// ball
				player p29 = new player("Mohsin Khan", 13, "LSG", 14, 59, 30);// ball
				player p30 = new player("Krunal Pandya", 24, "LSG", 1326, 61, 109);// all
				player p31 = new player("Deepak Hooda", 5, "LSG", 1236, 17, 95);// all
			

				player p32 = new player("Rohit Sharma ", 45, "MI", 4982, 0, 187);// bat
				player p33 = new player("Suryakumar Yadav", 63, "MI", 2700, 0, 120);// bat
				player p34 = new player("Piyush Chawla", 11, "MI", 550, 157, 170);// ball
				player p35 = new player("Jason Behrendorff", 67, "MI", 00, 60, 40);// ball
				player p36 = new player("Cameron Green", 42, "MI", 2600, 40, 50);// all
				player p37 = new player("Tim David", 20, "MI", 1500, 12, 70);// all
				
				player p38 = new player("Shikhar Dhawan", 25, "PK", 6536, 0, 210);// bat
				player p39 = new player("Rilee Rossouw", 17, "PK", 678, 0, 21);// bat
				player p40 = new player("Kagiso Rabada", 25, "PK", 73, 106, 71);// ball
				player p41 = new player("Arshdeep Singh", 2, "PK", 23, 56, 44);// ball
				player p42 = new player("Sam Curran", 58, "PK", 695, 47, 42);// all
				player p43 = new player(" Liam Livingstone", 23, "PK", 618, 117, 28);// all

				player p44 = new player("Yashasvi Jaiswal", 23, "RR", 1511, 0, 39);// bat
				player p45 = new player("Shimron Hetmyer", 15, "RR", 1385, 0, 61);// bat
				player p46 = new player("Trent Boult", 18, "RR", 44, 102, 85);// ball
				player p47 = new player("Yuzvendra Chahal", 3, "RR", 26, 187, 145);// ball
				player p48 = new player("Riyan Parag", 12, "RR", 600, 12, 54);// all
				player p49 = new player(" Ravichandran Ashwin", 99, "RR", 647, 171, 197);// all

				player p50 = new player("Virat Kohli", 18, "RCB", 7263, 4, 237);// bat
				player p51 = new player("Faf du Plessis", 18, "RCB", 4048, 0, 137);// bat
				player p52 = new player("Mohammed Siraj", 13, "RCB", 85, 99, 79);// ball
				player p53 = new player("Karn Sharma", 33, "RCB", 317, 59, 73);// ball
				player p54 = new player("Glenn Maxwell", 32, "RCB", 2711, 34, 120);// all
				player p55 = new player(" Cameron Green", 42, "RCB", 343, 15, 23);// all

				player p56 = new player("David Warner", 18, "SRH", 7263, 4, 85);// bat
				player p57 = new player("Kane Williamson", 18, "SRH", 4048, 0, 137);// bat
				player p58 = new player("Bhuvneshwar Kumar", 13, "SRH", 85, 99, 79);// ball
				player p59 = new player("Rashid Khan", 33, "SRH", 317, 59, 73);// ball
				player p60 = new player("Abdul Samad", 32, "SRH", 2711, 34, 120);// all
				player p20 = new player(" Umran Malik", 42, "SRH", 343, 15, 23);// all

				player p[] = { p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21,
						p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33, p34, p35, p36, p37, p38, p39, p40, p41, p42,
						p43, p44, p45, p46, p47, p48, p49, p50, p51, p52, p53, p54, p55, p56, p57, p58, p59, p60 };

				return p;

			}

		}
			
		


			
			
			



