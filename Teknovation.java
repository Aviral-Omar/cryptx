import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Teknovation extends Application{

static int level=1;
boolean b;
GridPane g1;
GridPane g2;
    Text t1;
    Label l1;
    Label l2;
    Label l3;
    Label l4;
TextField tf1;
TextField tf2;
PasswordField p1;
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Scene s1;
    Scene s2;

    @Override
public void start(Stage Window){
Window.setTitle("Crypt-X");
        g1=new GridPane();
        g2=new GridPane();

        t1=new Text("Level "+level);
t1.setId("Level");

        l1=new Label();
        l2=new Label("Enter Answer:");
        l3=new Label("Enter Password:");
        l4=new Label("Enter Level:");

        tf1=new TextField();
tf1.setPromptText("Level "+level);
tf1.setOnAction(event -> act());
tf1.setId("Textbox");
        tf2=new TextField();
tf2.setId("Textbox");

        p1=new PasswordField();
p1.setId("Textbox");

        b1=new Button("Hint");
b1.setOnAction(event ->getHostServices().showDocument(site()));
        b2=new Button("Level Select");
        b3=new Button("Confirm");
        b4=new Button("Back");

GridPane.setConstraints(t1, 5,1);
GridPane.setConstraints(l1, 5,2);
GridPane.setConstraints(l2, 4,3);
GridPane.setConstraints(l3, 2,2);
GridPane.setConstraints(l4, 2,3);
GridPane.setConstraints(tf1, 5,3);
GridPane.setConstraints(p1, 3,2);
GridPane.setConstraints(tf2, 3,3);
GridPane.setConstraints(b1, 5,5);
GridPane.setConstraints(b2, 6,5);
GridPane.setConstraints(b3, 3,5);
GridPane.setConstraints(b4, 4,5);

g1.setPadding(new Insets(25));
g1.setHgap(8);
g1.setVgap(6);
g1.getChildren().addAll(t1, tf1, l1, l2, b1, b2);
g2.setPadding(new Insets(25));
g2.setHgap(8);
g2.setVgap(6);
g2.getChildren().addAll(p1, tf2, l3, l4, b3, b4);

        s1=new Scene(g1, 560, 280);
s1.getStylesheets().add("Dark.css");
        s2=new Scene(g2, 560, 280);
s2.getStylesheets().add("Dark.css");
Window.setScene(s1);
Window.show();

b2.setOnAction(event ->Window.setScene(s2));
b3.setOnAction(event -> {
if(p1.getText().equals("Password")) {
try {
if (Integer.valueOf(tf2.getText()) <= 25) {
level = Integer.valueOf(tf2.getText());
p1.clear();
t1.setText("Level " + level);
tf1.setPromptText("Level " + level);
tf2.setText("Done!");
                    } else
tf2.setText("Enter Valid Level");
                }
catch(NumberFormatException e){
tf2.setText("Enter Valid Level");
                    }
            }
else
tf2.setText("Wrong Password");
        });
b4.setOnAction(event ->Window.setScene(s1));
    }

private boolean checker(String text){
switch (level){
case 1: return text.equals("mahendrasinghdhoni");
case 2: return text.equals("osamabinladen");
case 3: return text.equals("wikileaks");
case 4: return text.equals("sherlock");
case 5: return text.equals("bradleycooper");
case 6: return text.equals("ironman");
case 7: return text.equals("sheilinghousecomputerclub");
case 8: return text.equals("intel");
case 9: return text.equals("baskinrobins");
case 10: return text.equals("mamtabanerjee");
case 11: return text.equals("pythagoras");
case 12: return text.equals("expectopatronum");
case 13: return text.equals("keanureeves");
case 14: return text.equals("stephencurry");
case 15: return text.equals("alanturing");
case 16: return text.equals("sandisk");
case 17: return text.equals("sacredgames");
case 18: return text.equals("operationbluestar");
case 19: return text.equals("ramayana");
case 20: return text.equals("imaginedragons");
case 21: return text.equals("gordonramsay");
case 22: return text.equals("edith");
case 23: return text.equals("raw");
case 24: return text.equals("theviralfever");
case 25: return text.equals("sheilinghouseschool");

default: return false;
        }
    }

private void act()
{
        b=checker(tf1.getText());
if (b)
 {
level++;
l1.setText("Correct Answer");
            b = false;
t1.setText("Level " + level);
tf1.setPromptText("Level " + level);
if (level == 26)
 {
g1.getChildren().removeAll(t1, tf1, b1, b1, l2, b2);
l1.setText("Congratulations! You completed Crypt-X!");
            }
        }
else
l1.setText("Wrong Answer");
tf1.clear();
    }

public String site(){
switch(level){
case 1: return "https://drive.google.com/open?id=1ufbWjTbelvlo4y_LEHj4sUP2dI5NWlyK";
case 2: return "https://drive.google.com/open?id=1KvS6ijZeH1oEW-FBWgvvXTIzN_WCgRf6";
case 3: return "https://drive.google.com/open?id=1sNCGosCYH1ivFxoWYgjUnWoyPWZ28Gk2";
case 4: return "https://drive.google.com/open?id=1vXDRkiWnGa-pRqWIX2SekTLJJHRfH3P6";
case 5: return "https://drive.google.com/open?id=186WNZVR7hQgB2dMfyB3_iMuv4fHsTNcm";
case 6: return "https://drive.google.com/open?id=1j2q2aZtm5MvEOuv_9ff1ZWtzfmr76EXo";
case 7: return "https://drive.google.com/open?id=1T9MJq8EhvSxNTbNaLOcn_s7GEs0Kp5Pj";
case 8: return "https://drive.google.com/open?id=1E7iP2NerinaGjNt0KN6CNbx-of4RsCxc";
case 9: return "https://drive.google.com/open?id=1qMHUwsD4RSs1yadwPQo07QhF9eqDun1s";
case 10: return "https://drive.google.com/open?id=1SxZKEsu3BSRqWnbO32CCkdkS5eyzQ8WY";
case 11: return "https://drive.google.com/open?id=1CIgCMlRprCQQG9shTSJM4LFGQ0AmeIcs";
case 12: return "https://drive.google.com/open?id=1QgHn9oZf_JnZjnrzzI0GxoHtgJnR7njt";
case 13: return "https://drive.google.com/open?id=1ia6ZAEe5xmOFIVetJLMEguKtnaWJcRAU";
case 14: return "https://drive.google.com/open?id=11P2bPkrRYlVb2hDzRc3XNdoGEJkw1_IU";
case 15: return "https://drive.google.com/open?id=1ECCTammZVNPqAZJfniubTFVlDzeAx6mM";
case 16: return "https://drive.google.com/open?id=1SFgYBTyrBy4V9-r5nhlyBXGllOGlIHrg";
case 17: return "https://drive.google.com/open?id=1Gu61r1TUBVoV3ujYJB2712z2LY2ApRm3";
case 18: return "https://drive.google.com/open?id=1wWKNwDcpIYnmgGlDx44JcxqCrtrDZn0N";
case 19: return "https://drive.google.com/open?id=1spaYAPHxncSKoQWiqcHyJtK1kxwuvIWD";
case 20: return "https://drive.google.com/open?id=1thsXjeco1LsJ0PqBRjagk9oXFQERIXZf";
case 21: return "https://drive.google.com/open?id=1NOFHeT1POPMGbByoamH4HOOGF0rAFMK9";
case 22: return "https://drive.google.com/open?id=1ltwfvAt1oYC4ejmMds4zvjVXEND5Sng7";
case 23: return "https://drive.google.com/open?id=15aQy4Km5E8fqkX7gCwa34X88mLmXdDS4";
case 24: return "https://drive.google.com/open?id=11H2hzQ07mAhJ5UtXUVbJ2PFLI6Sr3-TI";
case 25: return "https://drive.google.com/open?id=1JzlUJDdv4Jo9qvyIvgN5BsA3iZk7gy9A";
default: return "https://drive.google.com/open?id=1ufbWjTbelvlo4y_LEHj4sUP2dI5NWlyK";
        }
    }

public static void main(String[] args) {

launch(args);
    }
}

