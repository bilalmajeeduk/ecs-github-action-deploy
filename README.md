# ecs-github-action-deploy-to-ECS-fargate


![AWS Architecture Diagram](/AWS-ArchitectureDiagram.png)



Here’s the updated architecture diagram featuring:

* User → GitHub Actions with GitHub Secrets.
* Amazon ECR storing the Docker image.
* AWS CloudWatch for logs and monitoring.
* Amazon ECS in a public VPC using AWS Fargate.
* Task Definition feeding into two services: Dev & Prod.
* Both services deployed to AWS ECS fargate profile.


Working URL to test
http://localhost:8080/person

# Question
Why does the workflow rebuild & push a new Docker image even when Java code hasn't changed?
# Top Answers
1. **SHA-based tagging**: Every commit (including CI/config changes) uses a new SHA tag.
2. **Immutable registry**: ECR won’t reuse existing tags; missing tag triggers a fresh build.

# Reasons
* Guarantees reproducible deployments by binding images to commit SHAs.
* Prevents stale code; to reuse images, narrow triggers with path filters.
* Alternatively, retag existing manifest or use a stable tag like `latest`.