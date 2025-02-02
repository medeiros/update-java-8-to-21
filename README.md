# Update-java-8-to-21

Simple project to practice new features added in Java lang since 1.8 until 21.
- Credit: This learning project is based on the Udemy Course 
"[Master the latest topics; get Oracle OCP Certification (1Z0-830, 829, 819, 809) and code a Spring Boot application](https://fico.udemy.com/course/ocp11_from_oca8/learn/lecture/29854098#overview)", 
by Dr. Seán Kennedy OCA, OCP.

![main workflow](https://github.com/medeiros/update-java-8-to-21/actions/workflows/maven.yml/badge.svg)

## Pre-requirements

### Note: Configure Maven to access HTTPS repo behind ZScaler Proxy

#### Export ZScaler certificate

- Open Certificate Window
  - Windows Control Panel > Manage User Certificates
- Access Certificate and Right-click into it
  - Trusted Root Certification > Certificates
  - Zscaler Root CA
- Export
  - Context menu: All Tasks / Export
  - Export `.cer` file to cacerts directory:
    - `%USERPROFILE%\.jdks\corretto-1.8.0_442\jre\lib\security\zscaler.cer`

#### Import ZScaler certificate into Java cacerts JKS

In Windows (WSL2):
```
# export JRE 1.8 bin to the PATH env var (for `keytool` usage)
export PATH=$PATH:/mnt/c/Users/DanielAssis/.jdks/corretto-1.8.0_442/bin/

# access cacerts directory
cd /mnt/c/Users/DanielAssis/.jdks/corretto-1.8.0_442/jre/lib/security

# import certificate into cacerts keystore
keytool.exe -importcert -file zscaler.cer -keystore ./cacerts \
    -alias zscaler -storepass changeit

# and check it
keytool.exe -list -keystore ./cacerts -alias zscaler
```

After that, Run Maven in IntelliJ using this JRE
- Access `Settings` menu <Ctrl+Alt+S>
- Build, Execution, Deployment > Build Tools > Maven > Runner
- Set JRE to use the proper Runtime
