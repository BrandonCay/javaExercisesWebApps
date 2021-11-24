read exName;
mkdir "${exName}";
cd "${exName}";

inputFileName=p
stdoutFileName=${inputFileName}
stderrFileName=err
runFileName=run
defaultJavaFileName=main

touch ${inputFileName}.dat ${stdoutFileName}.out ${stderrFileName}.out ${defaultJavaFileName}.java ${runFileName}.sh;
printf "fileName=m;\njavac \${fileName}.java;\njava \${fileName} < ${inputFileName}.dat 1> ${stdoutFileName}.out 2> ${stderrFileName}.out" > ${runFileName}.sh;

