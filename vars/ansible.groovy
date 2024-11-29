def call() {
    ansiblePlaybook(
        credentialsId: config.credentialsId ?: '67566dc8-069e-4c59-8308-aac784619a7b',
        installation: config.installation ?: 'Ansible',
        inventory: config.inventory ?: 'resources/aws_ec2.yml',
        playbook: config.playbook ?: 'resources/playbook.yml',
        vaultTmpPath: config.vaultTmpPath ?: ''
    )
}
