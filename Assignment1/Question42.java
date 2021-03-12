/*42.
	Write a program to find the duplicate word from a long string.
 */
package Assignment1;

public class Question42 {

        public static void main(String[] args) {
            String string = " Time flies like an arrow; fruit flies like a banana ";
            int count;

            //Converts the string into lowercase
            string = string.toLowerCase();

            //Split the string into words using built-in function
            String words[] = string.split(" ");

            System.out.println("Duplicate words in a given string : ");
            for(int i = 0; i < words.length; i++) {
                count = 1;
                for(int j = i+1; j < words.length; j++) {
                    if(words[i].equals(words[j])) {
                        count++;
                        //Set words[j] to 0 to avoid printing visited word
                        words[j] = "0";
                    }
                }

                //Displays the duplicate word if count is greater than 1
                if(count > 1 && words[i] != "0")
                    System.out.println(words[i]);
            }
        }
    }

//end of the program