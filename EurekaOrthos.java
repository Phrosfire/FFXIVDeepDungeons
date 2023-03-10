package DeepDungeons;

import javax.swing.*;

public class EurekaOrthos {
	private static int CurrentLevel = 0;
	private static int CurrentExp = -1;
	private static int LevelTarget = 0;
	private static int ExpRequired;
	private static int ExpPerRun;
	private static int TotalRuns;
	
	public static void main(String[] args) {
		while (CurrentLevel == 0) {
			GetLevel();
			if (CurrentLevel > 89) {
				return;
			}
			else if (CurrentLevel < 81 ) {
				return;
			}
			else {
				GetExpRequired();
			}
		}
		
		while (CurrentExp == -1) {
			GetCurrentExp();
		}
		
		while (LevelTarget == 0) {
			GetLevelTarget();
		}
		
		CalculateRuns();
		System.out.print("It will take " + TotalRuns + " runs to reach "
				+ "level " + LevelTarget + "\n");
		
	}
	
	public static void GetLevel() {
		try {
			CurrentLevel = Integer.parseInt(JOptionPane.showInputDialog("What level are you?"));
			if (CurrentLevel < 81) {
				System.out.print("You are not high enough of a level\n");
			}
			else if (CurrentLevel >= 81) {
				if (CurrentLevel >= 90) {
					if (CurrentLevel == 90) {
						System.out.print("You are already max level!\n");
					}
					else {
						System.out.print("Ehr Mah Gurd!  Is that you Yoshi-sama?\n");
					}
				}
				else {
					System.out.print("Your level has been registered as " + CurrentLevel +"\n");
				}
			}
		}
		catch (Exception e){
			System.out.print("Please enter a valid input\n");
		}
	}
	
	public static void GetLevelTarget() {
		try {
			LevelTarget = Integer.parseInt(JOptionPane.showInputDialog("What level do you want to go to?"));
			if (LevelTarget < 81 || LevelTarget > 90 ) {
				LevelTarget = 0;
				System.out.print("Please Select a valid level target\n");
			}
			else if (LevelTarget >= 82 & LevelTarget <= 90) {
				System.out.print("Your level target has been set as " + LevelTarget + "\n");	
			}
		}
		catch (Exception e){
			System.out.print("Please enter a valid input\n");
		}
	}
	
	public static void GetExpRequired(){
		if (CurrentLevel == 81) {
			ExpRequired = 6171000;
			ExpPerRun = 2561625;
		}
		else if (CurrentLevel == 82) {
			ExpRequired = 6942000;
			ExpPerRun = 2598750;
		}
		else if (CurrentLevel == 83) {
			ExpRequired = 7205000;
			ExpPerRun = 2635875;
		}
		else if (CurrentLevel == 84) {
			ExpRequired = 7948000;
			ExpPerRun = 2673000;
		}
		else if (CurrentLevel == 85) {
			ExpRequired = 8287000;
			ExpPerRun = 2710125;
		}
		else if (CurrentLevel == 86) {
			ExpRequired = 9231000;
			ExpPerRun = 2747250;
		}
		else if (CurrentLevel == 87) {
			ExpRequired = 9529000;
			ExpPerRun = 2784375;
		}
		else if (CurrentLevel == 88) {
			ExpRequired = 10458000;
			ExpPerRun = 2821500;
		}
		else if (CurrentLevel == 89) {
			ExpRequired = 10838000;
			ExpPerRun = 2858625;
		}
	}
	
	public static void GetCurrentExp() {
		try {
			CurrentExp = Integer.parseInt(JOptionPane.showInputDialog("How much Exp do you currently have?"));
			if (CurrentExp < 0) {
				CurrentExp = -1;
				System.out.print("You have entered an invalid amount of Exp\n");
			}
			else if (CurrentExp >= 0) {
				if (CurrentExp >= ExpRequired) {
					CurrentExp = -1;
					System.out.print("You have entered an invalid amount of Exp\n");
				}
			}
		}
		catch (Exception e){
			System.out.print("Please enter a valid input\n");
		}
	}
	
	public static void CalculateRuns() {
		while (CurrentLevel < LevelTarget) {
			if (CurrentLevel == 81) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 82) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 83) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 84) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 85) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 86) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 87) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 88) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
			else if (CurrentLevel == 89) {
				CurrentExp = CurrentExp + ExpPerRun;
				TotalRuns = TotalRuns + 1;
				if (CurrentExp >= ExpRequired) {
					CurrentLevel = CurrentLevel + 1;
					CurrentExp = CurrentExp - ExpRequired;
					GetExpRequired();
				}
			}
		}
	}
}