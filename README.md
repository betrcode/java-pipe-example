# Example of Java command line app using pipes

Need to build your own command line tools? 
Make them utilize the Unix pipes. 
Don't read directly from files, 
there are other tools that can do that better.

If you make your tool read from Unix pipes, 
you can compose it with other command line tools.

## Example usage

List all files in your home folder, 
process them with your tool and sort the output

`ls ~ | java -cp out/production/java-pipe-example/ se.bettercode.Main | sort`

Note: Your classpath (cp) might be different. 
It should point out the location of the Main.class file.
