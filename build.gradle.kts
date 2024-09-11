    plugins {
        id("java")
    }

    group = "org.example"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
    }

    dependencies {
        testImplementation(platform("org.junit:junit-bom:5.10.0"))
        testImplementation("org.junit.jupiter:junit-jupiter")

        // Hibernate core for JPA
        implementation("org.hibernate.orm:hibernate-core:6.6.0.Final")
        implementation ("org.hibernate:hibernate-envers:5.6.10.Final")
        implementation ("org.hibernate:hibernate-entitymanager:5.6.10.Final")

        implementation ("org.projectlombok:lombok:1.18.24")
        annotationProcessor ("org.projectlombok:lombok:1.18.24")

        implementation ("com.fasterxml.jackson.core:jackson-databind:2.13.4.1")
    }

    tasks.test {
        useJUnitPlatform()
    }