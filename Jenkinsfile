pipeline {
        agent any

        tools {
            // Install the Maven version configured as "M3" and add it to the path.
            maven "MV3"
        }

        stages {
            stage('Checkout') {
                steps {
                    // Get some code from a GitHub repository

                    git branch: 'main', url: 'https://github.com/thefinnerz/WhiteTeamTaxesV2'
                }
            }
            stage('Compile') {
                steps {
                    // Run Maven on a Unix agent.
                    sh "mvn clean compile"
                }
            }
            stage('Test') {
                steps {
                    sh "mvn test"
                }
            }
            stage('Package') {
                steps {
                    sh "mvn -Dmaven.test.skip -Dmaven.compile.skip package"
                }
            }
        }
}