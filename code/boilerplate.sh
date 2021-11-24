read exName;
mkdir "${exName}";
cd "${exName}";

inputFileName=p
stdoutFileName=${inputFileName}
stderrFileName=err
runFileName=run

touch ${inputFileName}.dat ${stdoutFileName}.out ${stdoutFileName}.out main.java;
cat "fileName=m;javac \${fileName}.java;java \${fileName} \ 
< ${inputFileName}.dat 1> ${stdoutFileName}.out 2> ${stderrFileName}.out " > ${runFileName}.sh

