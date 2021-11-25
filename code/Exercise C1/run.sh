#fileName
javac ${runFileName}.java;
java ${runFileName} < ${inputFileName}.dat 1> ${stdoutFileName}.out 2> ${stderrFileName}.out