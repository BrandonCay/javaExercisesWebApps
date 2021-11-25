#fileName
javac ${runFileName}.java;
java ${runFileName} "jo is not jo and is jo not" < ${inputFileName}.dat 1> ${stdoutFileName}.out 2> ${stderrFileName}.out
java ${runFileName} "if it is to be it is up to me to delegate" < ${inputFileName}.dat 1>> ${stdoutFileName}.out 2> ${stderrFileName}.out