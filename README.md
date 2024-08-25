# Minimalist Application Template

You can use this template to create a minimalist Grace application.

It's just a minimal Spring Boot application with Grace Core and Plugin API Supports.

However, you can add other Spring Boot Starters, or Grace Plugins after that.

### How to Use?

Grace `2023.0.0` provides Application Template to allow developers customize the generated project by using `--template` flag.

```bash
$ grace create-app \
grace.apps.minimalist \
--template https://github.com/grace-templates/minimalist.git
```

or,

```bash
$ grace create-app \
grace.apps.minimalist \
--template https://github.com/grace-templates/minimalist/archive/refs/heads/main.zip
```


Now, you'll have the following directory structure,

```bash
.
├── app
│   ├── conf
│   └── init
├── buildSrc
│   └── build.gradle
├── gradle
│   └── wrapper
├── src
│   ├── main
│   └── test
├── HELP.md
├── README.md
├── build.gradle
├── gradle.properties
├── gradlew
├── gradlew.bat
└── settings.gradle
```

Here is the list of what will NOT be included,

* asset-pipeline
* bootstrap
* database-migration
* events
* fields
* geb
* gsp
* hibernate
* jquery
* scaffolding

### Why you should rely on fresh, new, minimalist Grace application

Creating a minimal app has the following advantages:

* You may reach a deep understanding of the default plugins of Grace framework. Take time to understand the few plugins already included, then you will take time to understand the one you added.

* It’s very easy then to isolate a problem that arise in your daily production app. Just recreate another minimalist app, outside your repository, and put inside (maybe by copy/pasting) all files to recreate the bug you’re working on.

* Take time to see if you need any of the feature listed above. Maybe you want to use Spring JDBC or JOOQ instead of `GORM` and `Hibernate`. Actually, chances that you Grace app looks like the default one is next to zero.

### Support Versions

* Grace 2022.0.0+


### Links

- [Grace Framework](https://github.com/graceframework/grace-framework)
- [Grace Plugins](https://github.com/grace-plugins)
- [Grace Guides](https://github.com/grace-guides)
