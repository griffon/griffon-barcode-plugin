/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class BarcodeGriffonPlugin {
    // the plugin version
    String version = '0.4'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-barcode-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Generate barcode images'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
Generates barcode images using [Barcode4j][1] and QRCode using [QRGen][2].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*  | *Property*        | *Type*           | *Required*  | *Bindable* | *Notes*                               | 
| ------- | ----------------- | ---------------- | ----------- | ---------- | ------------------------------------- |
| barcode | generator         | String           | yes         | no         | defaults to `codabar`                 |
|         | barcodeGenerator  | BarcodeGenerator | no          | no         | alternate way to register a generator |
|         | message           | String           | yes         | no         | the text to code                      |
| qrcode  | message           | String           | yes         | no         | the text to code                      |

Valid values for `generator` are: codabar, code39, postnet, intl2of5, ean-128, royal-mail-cbc, ean-13, datamatrix, code128, 
ean128, pdf417, upc-a, upc-e, usps4cb, ean-8

[1]: http://barcode4j.sourceforge.net/
[2]: http://kenglxn.github.com/QRGen/
'''
}
