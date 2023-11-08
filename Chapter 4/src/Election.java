import java.text.NumberFormat;
import java.util.Scanner;
public class Election {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		int awbryNy;
		int martinezNy;
		int awbryNj;
		int martinezNj;
		int awbryCt;
		int martinezCt;
		double totalAwbry;
		double totalMartinez;
		double awbryPercent;
		double martinezPercent;
		double totalVotes;
		System.out.print("Enter the election results for Awbry in New York: ");
		awbryNy = input.nextInt();
		System.out.print("Enter the election results for Martinez in New York: ");
		martinezNy = input.nextInt();
		System.out.print("Enter the election results for Awbry in New Jersey: ");
		awbryNj = input.nextInt();
		System.out.print("Enter the election results for Martinez in New Jersey: ");
		martinezNj = input.nextInt();
		System.out.print("Enter the election results for Awbry in Connecticut: ");
		awbryCt = input.nextInt();
		System.out.print("Enter the election results for Martinez in Connecticut: ");
		martinezCt = input.nextInt();
		
		totalAwbry = awbryNy + awbryNj + awbryCt;
		totalMartinez = martinezNy + martinezNj + martinezCt;
		
		totalVotes = totalAwbry + totalMartinez;
		awbryPercent = totalAwbry/totalVotes;
		martinezPercent = totalMartinez/totalVotes;
		
		System.out.format("%8s %10s %12s", "Candidate", "Votes", "Percentage\n");
		System.out.format("%5s %12s %11s", "Awbry", totalAwbry, percent.format(awbryPercent)+ "\n" );
		System.out.format("%8s %8s %11s", "Martinez ", totalMartinez, percent.format(martinezPercent) + "\n");
		System.out.format("%1s ", "TOTAL VOTES:     " + totalVotes);
		
	}

}
