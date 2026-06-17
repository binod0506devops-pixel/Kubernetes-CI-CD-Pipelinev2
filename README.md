Developer pushes code to GitHub
↓
GitHub Actions starts automatically
↓
Maven Build
↓
Run Unit Tests
↓
SonarQube/SonarCloud Analysis
↓
Build Docker Image
↓
Push Image to Amazon ECR
↓
Update Kubernetes Manifests
↓
Argo CD deploys changes to Amazon EKS



### Interaction Between Docker Hub and GitHub

* Create a personal access token on Docker Hub.
* Store the Docker username and token as GitHub repository secrets.
* In the GitHub Actions workflow, use these secrets to log in to Docker Hub and push Docker images.

### Interaction Between SonarQube and GitHub

* Create a project on SonarQube.
* Generate a SonarQube token for authentication.
* Store the SonarQube token as a GitHub repository secret.
* In the GitHub Actions workflow, configure the SonarQube scanner using this token.
* Run SonarQube analysis during the CI process to ensure code quality checks.


