FROM ubuntu:latest
LABEL authors="mohamedogleh"
EXPOSE 8080
ENTRYPOINT ["top", "-b"]