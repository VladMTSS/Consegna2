# Consegna2

[![Coverage Status](https://coveralls.io/repos/github/VladMTSS/Consegna2/badge.svg?branch=develop)](https://coveralls.io/github/VladMTSS/Consegna2?branch=develop)

[![Java CI with Maven](https://github.com/VladMTSS/Consegna2/actions/workflows/maven.yml/badge.svg)](https://github.com/VladMTSS/Consegna2/actions/workflows/maven.yml)

Coveralls does not detect our token for some reason even though it's added to the repo secrets with the proper name and proper value for the token

here's instead the build successs directly from Maven on a local build of the most up to date version of the repo

Maven build result:

[INFO] Running it.unipd.mtss.IntegerToRomanTest

[INFO] Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.101 s -- in it.unipd.mtss.IntegerToRomanTest

[INFO] Running it.unipd.mtss.RomanPrinterTest

[INFO] Tests run: 10, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.001 s -- in it.unipd.mtss.RomanPrinterTest

[INFO]

[INFO] Results:

[INFO]

[INFO] Tests run: 12, Failures: 0, Errors: 0, Skipped: 0

[INFO]

[INFO]

[INFO] --- jar:3.4.1:jar (default-jar) @ roman-number ---

[INFO] Building jar: C:\Users\Dornan\Consegna2\target\roman-number-1.0-SNAPSHOT.jar

[INFO]

[INFO] --- checkstyle:3.3.0:check (checkstyle-validation) @ roman-number ---

[INFO] Starting audit...

Audit done.

[INFO] You have 0 Checkstyle violations.

[INFO]

[INFO] --- jacoco:0.8.7:report (default-report) @ roman-number ---

[INFO] Loading execution data file C:\Users\Dornan\Consegna2\target\jacoco.exec

[INFO] Analyzed bundle 'roman-number' with 2 classes

[INFO]

[INFO] --- jacoco:0.8.7:check (default-check) @ roman-number ---

[INFO] Loading execution data file C:\Users\Dornan\Consegna2\target\jacoco.exec

[INFO] Analyzed bundle 'roman-number' with 2 classes

[INFO] All coverage checks have been met.

[INFO]

[INFO] --- clean:3.2.0:clean (default-clean) @ roman-number ---

[INFO] Deleting C:\Users\Dornan\Consegna2\target

[INFO] ------------------------------------------------------------------------

[INFO] BUILD SUCCESS

[INFO] ------------------------------------------------------------------------

[INFO] Total time:  5.752 s

[INFO] Finished at: 2025-05-09T14:34:32+02:00

[INFO] ------------------------------------------------------------------------

