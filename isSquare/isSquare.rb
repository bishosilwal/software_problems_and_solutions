#
class IsSquare
  def is_square?(number)
    (number / 2).to_i.times do |index|
     return 1 if index * index == number  
    end
    return 0
  end
end

number = 12
puts IsSquare.new.is_square?(number)

number = 16
puts IsSquare.new.is_square?(number)

number = 55
puts IsSquare.new.is_square?(number)

number = 100
puts IsSquare.new.is_square?(number)

number = 136546
puts IsSquare.new.is_square?(number)