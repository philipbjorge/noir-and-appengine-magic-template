(ns infinite-social-wall.views.welcome
  (:require [infinite-social-wall.views.common :as common])
  (:use [noir.core :only [defpage]]
        [hiccup.core :only [html]]))

(defpage "/" []
         (common/layout
           [:p "Welcome to infinite-social-wall"]))
