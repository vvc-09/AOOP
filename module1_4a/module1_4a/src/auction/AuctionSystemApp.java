package auction;

public class AuctionSystemApp {
	public static void main(String[] args) {
        // Create an auction
        Auction auction = new Auction();

        // Create bidders
        Bidder alice = new Bidder("Alice");
        Bidder bob = new Bidder("Bob");

        // Subscribe bidders to auction
        auction.addObserver(alice);
        auction.addObserver(bob);

        // Start the auction process
        auction.setItem("Vintage Watch");
        auction.startBidding();
        auction.endBidding();

        // Unsubscribe a bidder
        auction.removeObserver(bob);

        // Start another auction process
        auction.setItem("Antique Vase");
        auction.startBidding();
    }
}
