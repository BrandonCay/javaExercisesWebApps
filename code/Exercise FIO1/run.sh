#use env
javac ${runFileName}.java;
java ${runFileName} input.txt output.txt < ${inputFileName}.dat 1> ${stdoutFileName}.out 2> ${stderrFileName}.out