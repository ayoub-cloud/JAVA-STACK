import java.text.SimpleDateFormat;
import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return "Hello, " + name + ". Lovely to see you.";
    }

    public String dateAnnouncement() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM dd HH:mm:ss z yyyy");
        Date currentDate = new Date();
        return "It is currently " + dateFormat.format(currentDate);
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (conversation.contains("Alfred")) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that, I shall retire.";
        }
    }

    // NINJA BONUS
    // Your own method for the Alfred bot using any String methods
    public String angryResponse(String input) {
        return input.toUpperCase() + "!!! How dare you say that?";
    }

    // NINJA BONUS
    // Overloaded version of guestGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return "Good " + dayPeriod + ", " + name + ". Lovely to see you.";
    }
}


 // out puts
//  Hello, lovely to see you. How are you?
// Hello, Beth Kane. Lovely to see you.
// It is currently Sun Jul 31 15:23:30 PDT 2023.
// Right away, sir. She certainly isn't sophisticated enough for that.
// At your service. As you wish, naturally.
// Right. And with that, I shall retire.
// YOU ARE SO ANNOYING!!!
// Good morning, John Doe. Lovely to see you.
