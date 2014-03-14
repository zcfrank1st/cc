(ns cc.core
  (:gen-class))
(import 'java.lang.String)
(import 'java.util.UUID)

;;测试用
(defn out
  [x]
  (println (class x)))

;;返回字符串的长度
(defn string-length
  "figure out the length of the string
     <return> long"
  [x]
  (let [n (String. x)]
    (let [ret (.length n)] (do (println ret) ret))))

;;获取子字符串(正常序)
(defn sub-string
  "unlike java sub-string it returns the normal order
     <return> string"
  [s x y]
  (let [ret (subs s (- x 1) y)] (do (println ret) ret)))

;;按字符分割字符串,返回clojure vector
(defn string-split
  "like java split
     <return> vector"
  [s token]
  (let [s1 (String. s)]
    (do (let [ret (vec (seq (.split s1 token)))] (println ret) ret))))

;;是否包含字符串
(defn str-contains?
  "test if contains strings
     <return> true or false"
  [s token]
  (.contains s token))

;;字符串翻转
(defn str-reverse
  "reverse your string
     <return> string "
  [s]
  (apply str (reverse s)))

;;字符串替换
(defn str-replace
  "replace string elements
     <return> string"
  [s x y]
  (.replaceAll s x y))

;;获取random UUID
(defn str-uuid
  "gengerate a random uuid string
     <return> string"
  []
  (.toString (UUID/randomUUID)))


(defn -main
  [& args]
  (println "hello world!"))




