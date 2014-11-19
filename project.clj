(defproject tesseract-clj "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main ^:skip-aot tesseract-clj.core
 :resource-paths ["lib/tess4j.jar" "lib/ghost4j-0.5.1.jar" "lib/jai_imageio.jar" "lib/jna-4.1.0.jar" "lib/junit-4.10.jar" "lib/log4j-1.2.17.jar" "lib/tess4j.jar"]
  :dependencies [[org.clojure/clojure "1.5.1"]])
