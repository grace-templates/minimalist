println "Creating a minimal application by Grace v${project.graceVersion}"

ant.sequential {
    say "Deleting some directories..."

    delete dir: "app/assets"
    delete dir: "app/controllers"
    delete dir: "app/domain"
    delete dir: "app/i18n"
    delete dir: "app/services"
    delete dir: "app/taglib"
    delete dir: "app/utils"
    delete dir: "app/views"
    delete dir: "db"
    delete dir: "src/integration-test"

    say 'Done.'
}
