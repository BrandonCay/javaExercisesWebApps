read exName
mkdir "${exName}"

inputFileName=p
stdoutFileName=${inputFileName}
stderrFileName=err
defaultJavaFileName=main
runFileName=run
export runfileName

cd "${exName}";

touch ${inputFileName}.dat ${stdoutFileName}.out ${stderrFileName}.out ${defaultJavaFileName}.java ${runFileName}.sh \
${runFileName}.sh rmBadChars.sh instructions.txt;

cd ..;

#copy files into
cat runJavaBP.sh > "${exName}/${runFileName}.sh";
cat rmBadCharsBP.sh > "${exName}/rmBadChars.sh";
cat mainBP.sh > "${exName}/main.sh";

echo "This project uses shell files for execution and processing. Any files renamed with 'sub#' appended at the end was for submitting duplicate file names onto BB. I cannot upload shell scripts to BB. Contact owner for github link"  > "${exName}/README.txt";
cd "${exName}";
code .;
echo "Boilerplate fin";

