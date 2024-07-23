def visitFile(self, file, attrs):
    result = super().visitFile(file, attrs)
    relativize = self.expected.toPath().relativize(file)
    fileInOther = self.generated.toPath().resolve(relativize).toFile()
    log.debug(f'=== comparing: {file} to {fileInOther}')
    expectedContents = FileUtils.readFileToString(file.toFile())
    generatedContents = FileUtils.readFileToString(fileInOther)
    assert expectedContents == generatedContents, f'({fileInOther})  csv standard doesn\'t match expected ({file})!'
    return result