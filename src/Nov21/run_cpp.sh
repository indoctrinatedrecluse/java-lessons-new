prog=$1

clear
g++ $prog.cpp -o $prog
./$prog.exe
rm -rf *.exe