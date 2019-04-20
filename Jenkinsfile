pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh 'echo "Hello World"'
                sh '''
                    echo "Multiline shell steps works too"
                    ls -lah
                '''
            }
        }
        stage('deploy') {
            steps {
                retry(3) {
                    sh 'bash echo.sh'
                }
                timeout(time:3, unit: 'MINUTES') {
                    sh 'bash health-check.sh'
                }
            }
        }

    }
}

