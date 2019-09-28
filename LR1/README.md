Hash Generator
Description:
Console program for generating file hashes using md5 and sha256 hash functions. Works in interactive and default modes. Tips:

Choose interactive mode to calculate hashes of each of your files using both md5 and sha256 hash functions.
Choose default mode to calculate hashes of as many files as you want at once using either md5 or sha256 function.
Compilation:
Before running the program type in terminal:

$ ./manual.sh
(File, which contains all necessary instructions)

Usage:
To use interactive mode write in terminal:

$ java -jar Main.jar -i

To use default mode write in terminal one of these lines:

 $ java -jar Main.jar -md5 -f /*file paths separated by spaces*/

 $ java -jar Main.jar -sha256 -f /*file paths separated by spaces*/
depending on the hash function you want to use.
