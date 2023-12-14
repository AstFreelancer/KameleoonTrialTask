FROM openjdk:17
COPY out/artifacts/KameleoonTrialTask_jar/KameleoonTrialTask.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java","KameleoonTrialTask"]