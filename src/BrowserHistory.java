class Site {
    public Site prv;
    public Site next;
    public final String url;
    public Site(final String url) {
        this.url = url;
    }
}

class BrowserHistory1 {

    private Site curr;

    public BrowserHistory1(String homepage) {
        curr = new Site(homepage);
        System.out.println("Homepage: " + homepage);
    }

    public void visit(String url) {
        curr.next = new Site(url);
        curr.next.prv = curr;
        curr = curr.next;
        System.out.println("Directing to: " + url);
    }

    public String back(int steps) {
        System.out.println("\nCurrently at: " + curr.url);
        System.out.println("Going Back " + steps + " step/s");
        while (curr.prv != null && steps-- > 0)
            curr = curr.prv;
        return curr.url;
    }

    public String forward(int steps) {
        System.out.println("\nCurrently at: " + curr.url);
        System.out.println("Going Forward " + steps + " step/s");
        while (curr.next != null && steps-- > 0)
            curr = curr.next;
        return curr.url;
    }
}

public class BrowserHistory {
    public static void main(String[] args) {
        BrowserHistory1 bh = new BrowserHistory1("MyHome.com");
        bh.visit("google.com");
        bh.visit("facebook.com");
        bh.visit("youtube.com");

        String back_step = bh.back(1);
        System.out.println("Redirected to " + back_step);

        String back_step1 = bh.back(1);
        System.out.println("Redirected to " + back_step1);

        String fwd_step = bh.forward(1);
        System.out.println("Redirected to " + fwd_step);

        String back_step2 = bh.back(1);
        System.out.println("Redirected to " + back_step2);

        String fwd_step1 = bh.forward(1);
        System.out.println("Redirected to " + fwd_step1);

        String back_step3 = bh.back(1);
        System.out.println("Redirected to " + back_step3);

        String back_step4 = bh.back(1);
        System.out.println("Redirected to " + back_step4);



    }
}
