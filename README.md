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
