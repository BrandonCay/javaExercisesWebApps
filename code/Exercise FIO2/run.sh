#use env
javac ${runFileName}.java;
java ${runFileName} ${javaArgs} < ${inputFileName}.dat 1> ${stdoutFileName}.out 2> ${stderrFileName}.out