# Linter Behavior
* The linter takes in a file path and iterates over that file line by line
* It checks to see if the line either:
    * ends with a ;
    * ends with a {
    * ends with a }
    * contains "if"
    * contains "else"
    * and is not a blank line
* Any line that does not meet this criteria causes a System.out.println that details what line contains the error.

* When this method runs you should expect to see either nothing - no errors - or a print out of each line that contains an error.