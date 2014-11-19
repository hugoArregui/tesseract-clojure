(ns tesseract-clj.core
  (:import net.sourceforge.tess4j.Tesseract)
  (:import java.io.File))

;; settings
(def tesseract-data-dir "/usr/share/tessdata")
(def language "eng")
(def test-file "eurotext.png")

(defn prepare-tesseract [data-path]
  (let [t (. Tesseract getInstance)]
    (.setDatapath t data-path)
    t))

(defn ocr [t lang img]
  (.setLanguage t lang)
  (.doOCR t img))

(defn -main []
  (let [tesseract (prepare-tesseract tesseract-data-dir)
        result    (ocr tesseract language (new File test-file))]
    (println result)))
