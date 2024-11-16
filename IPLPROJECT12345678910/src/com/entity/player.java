package com.entity;

public class player {
	private String name;
	private int jrcyno;
	private String teamname;
	private int run;
	private int wickets;
	private int matches;
	
	public player () {
		super();
	}
	
	
    //parameterized const
	public player(String name, int jrcyno, String teamname, int run, int wickets, int matches) {
		super();
		this.name = name;
		this.jrcyno = jrcyno;
		this.teamname = teamname;
		this.run = run;
		this.wickets = wickets;
		this.matches = matches;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getJrcyno() {
		return jrcyno;
	}


	public void setJrcyno(int jrcyno) {
		this.jrcyno = jrcyno;
	}


	public String getTeamname() {
		return teamname;
	}
	
	


	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}


	public int getRun() {
		return run;
	}


	public void setRun(int run) {
		this.run = run;
	}


	public int getWickets() {
		return wickets;
	}


	public void setWickets(int wickets) {
		this.wickets = wickets;
	}


	public int getMatches() {
		return matches;
	}


	public void setMatches(int matches) {
		this.matches = matches;
	}
	
	// getter setters
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Player [Name=");
		builder.append(name);
		builder.append(", jrcyNo=");
		builder.append(jrcyno);
		builder.append(", Team Name=");
		builder.append(teamname);
		builder.append(", Runs=");
		builder.append(run);
		builder.append(", Wickets=");
		builder.append(wickets);
		builder.append(", Matches=");
		builder.append(matches);
		builder.append("]");
		return builder.toString();
	}   
	
	
	
	
	
	
	
	

	
	
	
	
	

}

