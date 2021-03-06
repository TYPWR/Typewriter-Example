//
//  PetPbModel.m
//  Autogenerated by typewriter
//
//  Generation Date On 2018/01/08
//  Version: 1.0.0

#import "PetPbModel.h"
#import "PetPb.pbobjc.h"

@implementation PetPbModel
+ (nullable instancetype)modelWithPetPb:(PetPb *)prototype
{
    return [[self alloc] initWithPetPb:prototype];
}
- (nullable instancetype)initWithPetPb:(PetPb *)prototype
{
    NSParameterAssert(prototype);
    if (!(self = [super init])) {
        return nil;
    }
    PetPb *preprocess = [self initializerPreprocess:prototype];
    [self propertyMapWithPrototype:prototype mapping:@{@"name" : @"name",
                                                       @"color" : @"color"}];
    self->_limbs = [@([preprocess.limbs intValue]) unsignedIntValue];
    return self;
}
@end

@implementation PetPbModel (Extension)
- (PetPb *)initializerPreprocess:(PetPb *)preprocess
{
    return preprocess;
}
@end
