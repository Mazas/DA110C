package tadasIvanauskas;

/**
 * Created by hamekas on 10/14/16 @HKR ivanauskas15@gmail.com
 */
class Tickets {
    private static int id = 0;
    private String name;
    private String issue;
    private boolean solved;
    private String comment;
//make a new ticket
    Tickets(String name, String issue) {
        this.name = name;
        this.issue = issue;
        id++;
        solved = false;
    }
//get ticket by ID
    int getId() {
        return id;
    }

    @Override
    public String toString() {
        //if there is no comment, don'tshow it
        if (comment == null) {
            return "Written by: " + name + "\nID: " + id +
                    "\nStatus solved:" + solved + "\nIssue: " + issue + "\n";
        } else {
            //if there is a comment, show it
            return "Written by: " + name + "\nID: " + id +
                    "\nStatus solved:" + solved + "\nIssue: " + issue + "\n" +
                    "Comments: " + comment + "\n";

        }
    }

    boolean getStatus() {
        return solved;
    }

    String getName() {
        return name;
    }

    void closeTicket(String comment) {
        this.comment = comment;
        solved = true;
    }
}
