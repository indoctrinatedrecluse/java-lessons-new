prog=$1

clear
javac $prog.java
java $prog
rm -rf *.class